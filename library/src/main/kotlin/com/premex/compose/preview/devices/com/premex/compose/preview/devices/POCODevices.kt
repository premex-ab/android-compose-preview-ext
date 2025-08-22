package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POCO device specifications for Android Compose previews.
 *
 * This extension provides POCO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.POCO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.POCO: Any
  get() = object {
      /** DeviceSpec(manufacturer=POCO, code=alioth, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=alioth, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val ALIOTH = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=angelicain, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=angelicain, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ANGELICAIN = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POCO, code=aresin, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=aresin, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val ARESIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=beryl, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=beryl, width=1080,
      height=2400, dpi=450, isGoogleDevice=false).code */
      val BERYL = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=POCO, code=bhima, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=bhima, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val BHIMA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=blue, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=blue, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val BLUE = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POCO, code=breeze, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=breeze, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val BREEZE = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=camellia, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=camellia, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val CAMELLIA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=camellian, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=camellian, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val CAMELLIAN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=chopin, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=chopin, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val CHOPIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=citrine, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=citrine, width=1080,
      height=2400, dpi=450, isGoogleDevice=false).code */
      val CITRINE = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=POCO, code=citrus, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=citrus, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val CITRUS = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=dizi, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=dizi, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val DIZI = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POCO, code=duchamp, width=1220, height=2712, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=duchamp, width=1220,
      height=2712, dpi=480, isGoogleDevice=false).code */
      val DUCHAMP = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=POCO, code=earth, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=earth, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val EARTH = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POCO, code=emerald, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=emerald, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val EMERALD = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=evergreen, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=evergreen, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val EVERGREEN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=flame, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=flame, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val FLAME = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POCO, code=fleur, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=fleur, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val FLEUR = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=gale, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=gale, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val GALE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POCO, code=garnet, width=1220, height=2712, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=garnet, width=1220,
      height=2712, dpi=480, isGoogleDevice=false).code */
      val GARNET = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=POCO, code=gram, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=gram, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val GRAM = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=gust, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=gust, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val GUST = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POCO, code=ingres, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=ingres, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val INGRES = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=karna, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=karna, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val KARNA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=lake, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=lake, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val LAKE = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POCO, code=light, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=light, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val LIGHT = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=lmi, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=lmi, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val LMI = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=malachite, width=1220, height=2712, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=malachite, width=1220,
      height=2712, dpi=520, isGoogleDevice=false).code */
      val MALACHITE = "spec:width=1220,height=2712,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=POCO, code=marble, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=marble, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val MARBLE = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=marblein, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=marblein, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val MARBLEIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=miel, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=miel, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val MIEL = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=miro, width=1080, height=2400, dpi=600,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=miro, width=1080,
      height=2400, dpi=600, isGoogleDevice=false).code */
      val MIRO = "spec:width=1080,height=2400,unit=px,dpi=600"

      /** DeviceSpec(manufacturer=POCO, code=moon, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=moon, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val MOON = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=munch, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=munch, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val MUNCH = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=onyx, width=1280, height=2772, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=onyx, width=1280,
      height=2772, dpi=520, isGoogleDevice=false).code */
      val ONYX = "spec:width=1280,height=2772,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=POCO, code=peridot, width=1220, height=2712, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=peridot, width=1220,
      height=2712, dpi=480, isGoogleDevice=false).code */
      val PERIDOT = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=POCO, code=peux, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=peux, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val PEUX = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=phoenixin, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=phoenixin, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val PHOENIXIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=redwood, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=redwood, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=redwoodin, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=redwoodin, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val REDWOODIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=rock, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=rock, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val ROCK = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=rodin, width=1220, height=2712, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=rodin, width=1220,
      height=2712, dpi=520, isGoogleDevice=false).code */
      val RODIN = "spec:width=1220,height=2712,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=POCO, code=rosemary, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=rosemary, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val ROSEMARY = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=serenity, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=serenity, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val SERENITY = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POCO, code=shiva, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=shiva, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val SHIVA = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=sky, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=sky, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val SKY = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=snow, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=snow, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SNOW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POCO, code=stone, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=stone, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val STONE = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=surya, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=surya, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val SURYA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=thunder, width=1080, height=2408, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=thunder, width=1080,
      height=2408, dpi=440, isGoogleDevice=false).code */
      val THUNDER = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=vermeer, width=1440, height=3200, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=vermeer, width=1440,
      height=3200, dpi=560, isGoogleDevice=false).code */
      val VERMEER = "spec:width=1440,height=3200,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=POCO, code=veux, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=veux, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val VEUX = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=warm, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=warm, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val WARM = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POCO, code=water, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=water, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val WATER = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POCO, code=xaga, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=xaga, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val XAGA = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POCO, code=zorn, width=1440, height=3200, dpi=600,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POCO, code=zorn, width=1440,
      height=3200, dpi=600, isGoogleDevice=false).code */
      val ZORN = "spec:width=1440,height=3200,unit=px,dpi=600"

  }
