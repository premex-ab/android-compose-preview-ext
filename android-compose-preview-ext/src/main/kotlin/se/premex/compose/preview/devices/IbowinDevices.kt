package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ibowin device specifications for Android Compose previews.
 *
 * This extension provides ibowin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ibowin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ibowin: Any
  get() = object {
      /** ibowin M10ES11 */
      val M10ES11 = "spec:width=800,height=1280,unit=px,dpi=180"

  }
