package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Safaricom device specifications for Android Compose previews.
 *
 * This extension provides Safaricom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Safaricom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Safaricom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Safaricom, code=NEON_LITE, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Safaricom, code=NEON_LITE,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val NEON_LITE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Safaricom, code=NEON_NOVA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Safaricom, code=NEON_NOVA,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val NEON_NOVA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Safaricom, code=NEON_RAY, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Safaricom, code=NEON_RAY,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val NEON_RAY = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Safaricom, code=NEON_RAY_2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Safaricom, code=NEON_RAY_2,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val NEON_RAY_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Safaricom, code=NEON-RAY-2, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Safaricom, code=NEON-RAY-2,
      width=480, height=854, dpi=213, isGoogleDevice=false).code */
      val NEON_RAY_2 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Safaricom, code=NEON_RAY_PRO, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Safaricom, code=NEON_RAY_PRO,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val NEON_RAY_PRO = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Safaricom, code=Neon_Smarta_2, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Safaricom, code=Neon_Smarta_2,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val NEON_SMARTA_2 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Safaricom, code=Neon_Storm, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Safaricom, code=Neon_Storm,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val NEON_STORM = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Safaricom, code=Neon_Ultra_2, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Safaricom, code=Neon_Ultra_2,
      width=720, height=1600, dpi=300, isGoogleDevice=false).code */
      val NEON_ULTRA_2 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Safaricom, code=Safaricom_ET_Kimem, width=480, height=854,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Safaricom,
      code=Safaricom_ET_Kimem, width=480, height=854, dpi=213, isGoogleDevice=false).code */
      val SAFARICOM_ET_KIMEM = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Safaricom, code=Sajipro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Safaricom, code=Sajipro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SAJIPRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
