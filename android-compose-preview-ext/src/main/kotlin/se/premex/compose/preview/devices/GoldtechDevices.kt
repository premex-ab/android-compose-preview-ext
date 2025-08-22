package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Goldtech device specifications for Android Compose previews.
 *
 * This extension provides Goldtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Goldtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Goldtech: Any
  get() = object {
      /** Goldtech JTTAB035 */
      val JTTAB035 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
