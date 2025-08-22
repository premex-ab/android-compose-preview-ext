package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vertex device specifications for Android Compose previews.
 *
 * This extension provides Vertex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vertex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vertex: Any
  get() = object {
      /** Vertex Baccara */
      val BACCARA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vertex BLK3D */
      val BLK3D = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vertex CS24 */
      val CS24 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vertex CS28 */
      val CS28 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vertex EF */
      val EF = "spec:width=480,height=854,unit=px,dpi=240"

      /** Vertex GlocalMe_S1 */
      val GLOCALME_S1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Vertex Grip */
      val GRIP = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vertex Impress_Action */
      val IMPRESS_ACTION = "spec:width=480,height=800,unit=px,dpi=240"

      /** Vertex Impress_Aqua */
      val IMPRESS_AQUA = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vertex Impress_Bear */
      val IMPRESS_BEAR = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vertex Impress_Blade */
      val IMPRESS_BLADE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Vertex Impress_City */
      val IMPRESS_CITY = "spec:width=480,height=854,unit=px,dpi=240"

      /** Vertex Impress_Click_NFC */
      val IMPRESS_CLICK_NFC = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vertex Impress_Cube */
      val IMPRESS_CUBE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Vertex Impress_Eagle */
      val IMPRESS_EAGLE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vertex Impress_Fire */
      val IMPRESS_FIRE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Vertex Impress_Forest */
      val IMPRESS_FOREST = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vertex Impress_Frost */
      val IMPRESS_FROST = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vertex Impress_Indigo */
      val IMPRESS_INDIGO = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vertex Impress_Life */
      val IMPRESS_LIFE = "spec:width=480,height=854,unit=px,dpi=240"

      /** Vertex Impress_Luck */
      val IMPRESS_LUCK = "spec:width=480,height=854,unit=px,dpi=240"

      /** Vertex Impress_Luck4G_NFC */
      val IMPRESS_LUCK4G_NFC = "spec:width=540,height=960,unit=px,dpi=240"

      /** Vertex Impress_Play */
      val IMPRESS_PLAY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Vertex Impress_Stone */
      val IMPRESS_STONE = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vertex Impress_Sunset4G */
      val IMPRESS_SUNSET4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vertex Impress_Tor */
      val IMPRESS_TOR = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vertex Impress_Vega */
      val IMPRESS_VEGA = "spec:width=640,height=1280,unit=px,dpi=320"

      /** Vertex Impress_Vira */
      val IMPRESS_VIRA = "spec:width=640,height=1280,unit=px,dpi=320"

      /** Vertex Impress_Wolf */
      val IMPRESS_WOLF = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vertex Impress_Zeon4G */
      val IMPRESS_ZEON4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** Vertex Lion_DC */
      val LION_DC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Vertex Luck */
      val LUCK = "spec:width=480,height=854,unit=px,dpi=240"

      /** Vertex Luck_L100_3G */
      val LUCK_L100_3G = "spec:width=480,height=854,unit=px,dpi=240"

      /** Vertex Luck_L120_4G */
      val LUCK_L120_4G = "spec:width=540,height=960,unit=px,dpi=240"

      /** Vertex Luck_L130 */
      val LUCK_L130 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Vertex Pro_P300_4G */
      val PRO_P300_4G = "spec:width=600,height=1280,unit=px,dpi=240"

      /** Vertex Pro_P310_4G */
      val PRO_P310_4G = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Vertex TABX10 */
      val TABX10 = "spec:width=800,height=1280,unit=px,dpi=214"

      /** Vertex TABX8 */
      val TABX8 = "spec:width=800,height=1280,unit=px,dpi=214"

  }
