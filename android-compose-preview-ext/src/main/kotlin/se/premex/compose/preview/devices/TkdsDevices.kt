package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TKDS device specifications for Android Compose previews.
 *
 * This extension provides TKDS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tkds.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tkds: Any
  get() = object {
      /** TKDS T_101H */
      val T_101H = "spec:width=800,height=1280,unit=px,dpi=160"

  }
