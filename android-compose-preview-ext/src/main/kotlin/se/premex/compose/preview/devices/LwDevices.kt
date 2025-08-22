package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LW device specifications for Android Compose previews.
 *
 * This extension provides LW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lw.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lw: Any
  get() = object {
      /** LW LW788 */
      val LW788 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
