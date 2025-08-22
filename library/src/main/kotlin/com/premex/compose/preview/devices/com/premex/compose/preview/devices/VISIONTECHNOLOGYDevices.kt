package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VISION-TECHNOLOGY device specifications for Android Compose previews.
 *
 * This extension provides VISION-TECHNOLOGY device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VISIONTECHNOLOGY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VISIONTECHNOLOGY: Any
  get() = object {
      /** DeviceSpec(manufacturer=VISION-TECHNOLOGY, code=R1, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VISION-TECHNOLOGY, code=R1,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VISION-TECHNOLOGY, code=R2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VISION-TECHNOLOGY, code=R2,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VISION-TECHNOLOGY, code=R3, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VISION-TECHNOLOGY, code=R3,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
