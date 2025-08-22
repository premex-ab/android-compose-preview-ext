package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMART_KASSEL device specifications for Android Compose previews.
 *
 * This extension provides SMART_KASSEL device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMARTKASSEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMARTKASSEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=SMART_KASSEL, code=SK3401, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART_KASSEL, code=SK3401,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SK3401 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SMART_KASSEL, code=SK3402, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART_KASSEL, code=SK3402,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SK3402 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SMART_KASSEL, code=SK3403, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART_KASSEL, code=SK3403,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SK3403 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SMART_KASSEL, code=SK3404, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART_KASSEL, code=SK3404,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SK3404 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SMART_KASSEL, code=SK3405, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART_KASSEL, code=SK3405,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SK3405 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SMART_KASSEL, code=SK3501, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART_KASSEL, code=SK3501,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SK3501 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SMART_KASSEL, code=SK5501, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART_KASSEL, code=SK5501,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SK5501 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SMART_KASSEL, code=SK5502, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART_KASSEL, code=SK5502,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SK5502 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
