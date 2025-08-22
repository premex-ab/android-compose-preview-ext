package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DUNHOO device specifications for Android Compose previews.
 *
 * This extension provides DUNHOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DUNHOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DUNHOO: Any
  get() = object {
      /** DUNHOO UPad2 */
      val UPAD2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
