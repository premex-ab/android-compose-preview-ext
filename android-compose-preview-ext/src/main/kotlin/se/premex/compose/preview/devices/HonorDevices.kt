package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * honor device specifications for Android Compose previews.
 *
 * This extension provides honor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Honor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Honor: Any
  get() = object {
      /** honor HWFRD */
      val HWFRD = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
