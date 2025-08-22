package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GoMobile device specifications for Android Compose previews.
 *
 * This extension provides GoMobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gomobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gomobile: Any
  get() = object {
      /** GoMobile GO_SMART */
      val GO_SMART = "spec:width=480,height=854,unit=px,dpi=240"

  }
