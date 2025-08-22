package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CommBox device specifications for Android Compose previews.
 *
 * This extension provides CommBox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Commbox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Commbox: Any
  get() = object {
      /** CommBox rk3576_u */
      val RK3576_U = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
