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
      /** POCO alioth */
      val ALIOTH = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO angelicain */
      val ANGELICAIN = "spec:width=720,height=1600,unit=px,dpi=320"

      /** POCO aresin */
      val ARESIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO beryl */
      val BERYL = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** POCO bhima */
      val BHIMA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO blue */
      val BLUE = "spec:width=720,height=1650,unit=px,dpi=320"

      /** POCO breeze */
      val BREEZE = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** POCO camellia */
      val CAMELLIA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO camellian */
      val CAMELLIAN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO chopin */
      val CHOPIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO citrine */
      val CITRINE = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** POCO citrus */
      val CITRUS = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** POCO dizi */
      val DIZI = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** POCO duchamp */
      val DUCHAMP = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** POCO earth */
      val EARTH = "spec:width=720,height=1650,unit=px,dpi=320"

      /** POCO emerald */
      val EMERALD = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO evergreen */
      val EVERGREEN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO flame */
      val FLAME = "spec:width=720,height=1640,unit=px,dpi=320"

      /** POCO fleur */
      val FLEUR = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO gale */
      val GALE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** POCO garnet */
      val GARNET = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** POCO gram */
      val GRAM = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO gust */
      val GUST = "spec:width=720,height=1600,unit=px,dpi=320"

      /** POCO ingres */
      val INGRES = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO karna */
      val KARNA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO lake */
      val LAKE = "spec:width=720,height=1640,unit=px,dpi=320"

      /** POCO light */
      val LIGHT = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** POCO lmi */
      val LMI = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO malachite */
      val MALACHITE = "spec:width=1220,height=2712,unit=px,dpi=520"

      /** POCO marble */
      val MARBLE = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO marblein */
      val MARBLEIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO miel */
      val MIEL = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO miro */
      val MIRO = "spec:width=1080,height=2400,unit=px,dpi=600"

      /** POCO moon */
      val MOON = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** POCO munch */
      val MUNCH = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO onyx */
      val ONYX = "spec:width=1280,height=2772,unit=px,dpi=520"

      /** POCO peridot */
      val PERIDOT = "spec:width=1220,height=2712,unit=px,dpi=480"

      /** POCO peux */
      val PEUX = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO phoenixin */
      val PHOENIXIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO redwood */
      val REDWOOD = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO redwoodin */
      val REDWOODIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO rock */
      val ROCK = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** POCO rodin */
      val RODIN = "spec:width=1220,height=2712,unit=px,dpi=520"

      /** POCO rosemary */
      val ROSEMARY = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO serenity */
      val SERENITY = "spec:width=720,height=1640,unit=px,dpi=320"

      /** POCO shiva */
      val SHIVA = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** POCO sky */
      val SKY = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** POCO snow */
      val SNOW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** POCO stone */
      val STONE = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** POCO surya */
      val SURYA = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO thunder */
      val THUNDER = "spec:width=1080,height=2408,unit=px,dpi=440"

      /** POCO vermeer */
      val VERMEER = "spec:width=1440,height=3200,unit=px,dpi=560"

      /** POCO veux */
      val VEUX = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** POCO warm */
      val WARM = "spec:width=720,height=1640,unit=px,dpi=320"

      /** POCO water */
      val WATER = "spec:width=720,height=1600,unit=px,dpi=320"

      /** POCO xaga */
      val XAGA = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** POCO zorn */
      val ZORN = "spec:width=1440,height=3200,unit=px,dpi=600"

  }
