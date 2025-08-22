package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZMOOTH device specifications for Android Compose previews.
 *
 * This extension provides ZMOOTH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zmooth.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zmooth: Any
  get() = object {
      /** ZMOOTH Zkai-study-Tab */
      val ZKAI_STUDY_TAB = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
