package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CIBER device specifications for Android Compose previews.
 *
 * This extension provides CIBER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CIBER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CIBER: Any
  get() = object {
      /** DeviceSpec(manufacturer=CIBER, code=B610A103A, width=800, height=1280, dpi=204,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CIBER, code=B610A103A, width=800,
      height=1280, dpi=204, isGoogleDevice=false).code */
      val B610A103A = "spec:width=800,height=1280,unit=px,dpi=204"

      /** DeviceSpec(manufacturer=CIBER, code=B610A115, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CIBER, code=B610A115, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val B610A115 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CIBER, code=B610A215, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CIBER, code=B610A215, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val B610A215 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
