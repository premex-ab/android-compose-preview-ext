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
      /** DeviceSpec(manufacturer=Vertex, code=Baccara, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Baccara, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BACCARA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=BLK3D, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=BLK3D, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BLK3D = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=CS24, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=CS24, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CS24 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=CS28, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=CS28, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CS28 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=EF, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=EF, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val EF = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=GlocalMe_S1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=GlocalMe_S1,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val GLOCALME_S1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vertex, code=Grip, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Grip, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GRIP = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Action, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Action,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_ACTION = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Aqua, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Aqua,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_AQUA = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Bear, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Bear,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val IMPRESS_BEAR = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Blade, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Blade,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val IMPRESS_BLADE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_City, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_City,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_CITY = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Click_NFC, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Click_NFC,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_CLICK_NFC = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Cube, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Cube,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val IMPRESS_CUBE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Eagle, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Eagle,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val IMPRESS_EAGLE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Fire, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Fire,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val IMPRESS_FIRE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Forest, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Forest,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_FOREST = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Frost, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Frost,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val IMPRESS_FROST = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Indigo, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Indigo,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_INDIGO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Life, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Life,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_LIFE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Luck, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Luck,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_LUCK = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Luck4G_NFC, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Luck4G_NFC,
      width=540, height=960, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_LUCK4G_NFC = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Play, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Play,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val IMPRESS_PLAY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Stone, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Stone,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_STONE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Sunset4G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Sunset4G,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_SUNSET4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Tor, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Tor,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val IMPRESS_TOR = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Vega, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Vega,
      width=640, height=1280, dpi=320, isGoogleDevice=false).code */
      val IMPRESS_VEGA = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Vira, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Vira,
      width=640, height=1280, dpi=320, isGoogleDevice=false).code */
      val IMPRESS_VIRA = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Wolf, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Wolf,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val IMPRESS_WOLF = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=Impress_Zeon4G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Impress_Zeon4G,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_ZEON4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Lion_DC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Lion_DC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LION_DC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=Luck, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Luck, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LUCK = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Luck_L100_3G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Luck_L100_3G,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val LUCK_L100_3G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Luck_L120_4G, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Luck_L120_4G,
      width=540, height=960, dpi=240, isGoogleDevice=false).code */
      val LUCK_L120_4G = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Luck_L130, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Luck_L130, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val LUCK_L130 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Vertex, code=Pro_P300_4G, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Pro_P300_4G,
      width=600, height=1280, dpi=240, isGoogleDevice=false).code */
      val PRO_P300_4G = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Vertex, code=Pro_P310_4G, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=Pro_P310_4G,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val PRO_P310_4G = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Vertex, code=TABX10, width=800, height=1280, dpi=214,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=TABX10, width=800,
      height=1280, dpi=214, isGoogleDevice=false).code */
      val TABX10 = "spec:width=800,height=1280,unit=px,dpi=214"

      /** DeviceSpec(manufacturer=Vertex, code=TABX8, width=800, height=1280, dpi=214,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vertex, code=TABX8, width=800,
      height=1280, dpi=214, isGoogleDevice=false).code */
      val TABX8 = "spec:width=800,height=1280,unit=px,dpi=214"

  }
