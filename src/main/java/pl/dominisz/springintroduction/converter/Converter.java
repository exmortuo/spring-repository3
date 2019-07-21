package pl.dominisz.springintroduction.converter;

public interface Converter<TM, TD> {
  TM toModel(TD dto);

  TD toDto(TM model);
}
