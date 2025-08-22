package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * JOOYONTECH device specifications for Android Compose previews.
 *
 * This extension provides JOOYONTECH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jooyontech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jooyontech: Any
  get() = object {
      /** JOOYONTECH Q27CMA11 */
      val Q27CMA11 = "spec:width=1440,height=2560,unit=px,dpi=240"

  }
