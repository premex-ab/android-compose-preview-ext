package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MIRAY device specifications for Android Compose previews.
 *
 * This extension provides MIRAY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MIRAY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MIRAY: Any
  get() = object {
      /** DeviceSpec(manufacturer=MIRAY, code=MIDM_F10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=MIDM_F10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val MIDM_F10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MIRAY, code=R1, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=R1, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MIRAY, code=R10G, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=R10G, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MIRAY, code=R2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=R2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MIRAY, code=R3, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=R3, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MIRAY, code=R3_GTV, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=R3_GTV, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MIRAY, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MIRAY, code=R4_GTV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=R4_GTV, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MIRAY, code=TM4G_1006, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=TM4G_1006, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TM4G_1006 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MIRAY, code=TM4G_806, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=TM4G_806, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TM4G_806 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MIRAY, code=TPM4G_105, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=TPM4G_105, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TPM4G_105 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MIRAY, code=TPM4G_E108, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=TPM4G_E108, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val TPM4G_E108 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=MIRAY, code=TPM4G_E108_A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=TPM4G_E108_A,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TPM4G_E108_A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MIRAY, code=TPM4G_E9863, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=TPM4G_E9863, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TPM4G_E9863 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MIRAY, code=vileparle, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MIRAY, code=vileparle, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val VILEPARLE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
