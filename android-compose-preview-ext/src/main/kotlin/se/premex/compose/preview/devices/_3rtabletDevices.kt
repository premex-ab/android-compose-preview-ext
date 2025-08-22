package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * 3Rtablet device specifications for Android Compose previews.
 *
 * This extension provides 3Rtablet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._3rtablet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._3rtablet: Any
  get() = object {
      /** 3Rtablet VT-7GE */
      val VT_7GE = "spec:width=800,height=1280,unit=px,dpi=240"

  }
