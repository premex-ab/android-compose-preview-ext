package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOPELOTEK device specifications for Android Compose previews.
 *
 * This extension provides TOPELOTEK device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TOPELOTEK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TOPELOTEK: Any
  get() = object {
      /** DeviceSpec(manufacturer=TOPELOTEK, code=KIDS06, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOPELOTEK, code=KIDS06, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KIDS06 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOPELOTEK, code=KIDS708_709A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOPELOTEK, code=KIDS708_709A,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val KIDS708_709A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOPELOTEK, code=KIDS709, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOPELOTEK, code=KIDS709, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KIDS709 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOPELOTEK, code=KIDS720, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOPELOTEK, code=KIDS720, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KIDS720 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOPELOTEK, code=V7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOPELOTEK, code=V7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val V7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
