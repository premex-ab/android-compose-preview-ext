package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GMMZ device specifications for Android Compose previews.
 *
 * This extension provides GMMZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gmmz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gmmz: Any
  get() = object {
      /** GMMZ DongleTV1 */
      val DONGLETV1 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
