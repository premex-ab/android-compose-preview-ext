package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * YOUTAB device specifications for Android Compose previews.
 *
 * This extension provides YOUTAB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Youtab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Youtab: Any
  get() = object {
      /** YOUTAB YOUTAB_S7 */
      val YOUTAB_S7 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
