package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * rephone device specifications for Android Compose previews.
 *
 * This extension provides rephone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rephone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rephone: Any
  get() = object {
      /** DeviceSpec(manufacturer=rephone, code=rephone, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=rephone, code=rephone, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val REPHONE = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
