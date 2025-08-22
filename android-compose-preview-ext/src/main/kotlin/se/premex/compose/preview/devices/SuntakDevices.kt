package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SUNTAK device specifications for Android Compose previews.
 *
 * This extension provides SUNTAK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Suntak.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Suntak: Any
  get() = object {
      /** SUNTAK MOJO */
      val MOJO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SUNTAK MOX_2 */
      val MOX_2 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
