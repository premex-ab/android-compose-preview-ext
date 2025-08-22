package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RAKUTEN device specifications for Android Compose previews.
 *
 * This extension provides RAKUTEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RAKUTEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RAKUTEN: Any
  get() = object {
      /** DeviceSpec(manufacturer=RAKUTEN, code=Banagher, width=1440, height=3168, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAKUTEN, code=Banagher, width=1440,
      height=3168, dpi=640, isGoogleDevice=false).code */
      val BANAGHER = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=RAKUTEN, code=Chara, width=1080, height=2432, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAKUTEN, code=Chara, width=1080,
      height=2432, dpi=440, isGoogleDevice=false).code */
      val CHARA = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=RAKUTEN, code=JeridL, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAKUTEN, code=JeridL, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val JERIDL = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=RAKUTEN, code=Nee, width=1080, height=2432, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAKUTEN, code=Nee, width=1080,
      height=2432, dpi=440, isGoogleDevice=false).code */
      val NEE = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=RAKUTEN, code=Recoa, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAKUTEN, code=Recoa, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val RECOA = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=RAKUTEN, code=SH-RM11, width=1080, height=2220, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAKUTEN, code=SH-RM11, width=1080,
      height=2220, dpi=480, isGoogleDevice=false).code */
      val SH_RM11 = "spec:width=1080,height=2220,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=RAKUTEN, code=SH-RM12, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAKUTEN, code=SH-RM12, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SH_RM12 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=RAKUTEN, code=SX1, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAKUTEN, code=SX1, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val SX1 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=RAKUTEN, code=SX3, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAKUTEN, code=SX3, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val SX3 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=RAKUTEN, code=VG2, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAKUTEN, code=VG2, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val VG2 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
