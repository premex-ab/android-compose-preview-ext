package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKB_Cable device specifications for Android Compose previews.
 *
 * This extension provides SKB_Cable device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SkbCable.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SkbCable: Any
  get() = object {
      /** SKB_Cable K1100UA */
      val K1100UA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
