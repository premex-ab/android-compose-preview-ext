package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MicroTouch device specifications for Android Compose previews.
 *
 * This extension provides MicroTouch device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Microtouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Microtouch: Any
  get() = object {
      /** MicroTouch IDC_Series */
      val IDC_SERIES = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
