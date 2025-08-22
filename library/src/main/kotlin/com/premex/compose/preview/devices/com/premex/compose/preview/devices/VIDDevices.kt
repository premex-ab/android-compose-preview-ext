package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VID device specifications for Android Compose previews.
 *
 * This extension provides VID device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VID.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VID: Any
  get() = object {
      /** DeviceSpec(manufacturer=VID, code=GQ3115TF5_VID, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VID, code=GQ3115TF5_VID,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val GQ3115TF5_VID = "spec:width=1080,height=2408,unit=px,dpi=480"

  }
