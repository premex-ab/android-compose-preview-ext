package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * aiuto device specifications for Android Compose previews.
 *
 * This extension provides aiuto device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aiuto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aiuto: Any
  get() = object {
      /** DeviceSpec(manufacturer=aiuto, code=AT1001, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiuto, code=AT1001, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AT1001 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=aiuto, code=AT1002, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiuto, code=AT1002, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val AT1002 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=aiuto, code=AT702, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=aiuto, code=AT702, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val AT702 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
