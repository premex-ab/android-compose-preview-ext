package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Brightside device specifications for Android Compose previews.
 *
 * This extension provides Brightside device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Brightside.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Brightside: Any
  get() = object {
      /** DeviceSpec(manufacturer=Brightside, code=BS701, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brightside, code=BS701, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val BS701 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Brightside, code=KS_T01, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Brightside, code=KS_T01,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val KS_T01 = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
