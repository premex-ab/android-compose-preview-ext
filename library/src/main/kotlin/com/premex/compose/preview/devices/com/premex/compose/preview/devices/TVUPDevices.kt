package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TVUP device specifications for Android Compose previews.
 *
 * This extension provides TVUP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TVUP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TVUP: Any
  get() = object {
      /** DeviceSpec(manufacturer=TVUP, code=Denali_B866V2F, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TVUP, code=Denali_B866V2F,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val DENALI_B866V2F = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TVUP, code=HPA12_8GB, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TVUP, code=HPA12_8GB, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HPA12_8GB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
