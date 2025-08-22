package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GLOBALSEC device specifications for Android Compose previews.
 *
 * This extension provides GLOBALSEC device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Globalsec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Globalsec: Any
  get() = object {
      /** GLOBALSEC TAB_TEN */
      val TAB_TEN = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
