package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OMIX device specifications for Android Compose previews.
 *
 * This extension provides OMIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OMIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OMIX: Any
  get() = object {
      /** DeviceSpec(manufacturer=OMIX, code=MixTab_Pro_2, width=1200, height=2000, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=MixTab_Pro_2,
      width=1200, height=2000, dpi=360, isGoogleDevice=false).code */
      val MIXTAB_PRO_2 = "spec:width=1200,height=2000,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=OMIX, code=OMIX_X4, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=OMIX_X4, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OMIX_X4 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OMIX, code=X2032, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=X2032, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val X2032 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OMIX, code=X3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=X3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OMIX, code=X300, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=X300, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val X300 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OMIX, code=X400, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=X400, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val X400 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OMIX, code=X5, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=X5, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val X5 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OMIX, code=X500, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=X500, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val X500 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OMIX, code=X6, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=X6, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val X6 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OMIX, code=X600, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=X600, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val X600 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OMIX, code=X600_NFC, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=X600_NFC, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val X600_NFC = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OMIX, code=X7, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=X7, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val X7 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OMIX, code=X700, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OMIX, code=X700, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val X700 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
