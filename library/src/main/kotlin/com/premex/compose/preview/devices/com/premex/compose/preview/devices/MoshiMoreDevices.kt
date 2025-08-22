package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MoshiMore device specifications for Android Compose previews.
 *
 * This extension provides MoshiMore device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MoshiMore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MoshiMore: Any
  get() = object {
      /** DeviceSpec(manufacturer=MoshiMore, code=RG1, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MoshiMore, code=RG1, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val RG1 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
