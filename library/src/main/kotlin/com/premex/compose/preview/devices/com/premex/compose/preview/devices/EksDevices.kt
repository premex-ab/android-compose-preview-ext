package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * eks device specifications for Android Compose previews.
 *
 * This extension provides eks device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Eks.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Eks: Any
  get() = object {
      /** DeviceSpec(manufacturer=eks, code=X7, width=600, height=1024, dpi=186,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eks, code=X7, width=600,
      height=1024, dpi=186, isGoogleDevice=false).code */
      val X7 = "spec:width=600,height=1024,unit=px,dpi=186"

  }
