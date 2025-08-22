package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * iWaylink device specifications for Android Compose previews.
 *
 * This extension provides iWaylink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iwaylink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iwaylink: Any
  get() = object {
      /** iWaylink MC401_GWL */
      val MC401_GWL = "spec:width=1600,height=2560,unit=px,dpi=160"

      /** iWaylink TC601B_GWL */
      val TC601B_GWL = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** iWaylink TC601_GWL */
      val TC601_GWL = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
