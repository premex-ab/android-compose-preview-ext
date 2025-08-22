package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ALPHAWOLF device specifications for Android Compose previews.
 *
 * This extension provides ALPHAWOLF device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alphawolf.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alphawolf: Any
  get() = object {
      /** ALPHAWOLF A1 */
      val A1 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** ALPHAWOLF L1 */
      val L1 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** ALPHAWOLF L2 */
      val L2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** ALPHAWOLF L3 */
      val L3 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
