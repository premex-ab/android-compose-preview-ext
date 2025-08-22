package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * YSF device specifications for Android Compose previews.
 *
 * This extension provides YSF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ysf.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ysf: Any
  get() = object {
      /** YSF Rugged_tablet */
      val RUGGED_TABLET = "spec:width=1200,height=1920,unit=px,dpi=480"

  }
