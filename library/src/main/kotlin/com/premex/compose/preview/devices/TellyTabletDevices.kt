package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TellyTablet device specifications for Android Compose previews.
 *
 * This extension provides TellyTablet device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TellyTablet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TellyTablet: Any
  get() = object {
      /** TellyTablet VM_MD_001 */
      val VM_MD_001 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
