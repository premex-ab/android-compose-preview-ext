package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DICLE device specifications for Android Compose previews.
 *
 * This extension provides DICLE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dicle.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dicle: Any
  get() = object {
      /** DICLE DICLE_IPLAY40_PRO */
      val DICLE_IPLAY40_PRO = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
