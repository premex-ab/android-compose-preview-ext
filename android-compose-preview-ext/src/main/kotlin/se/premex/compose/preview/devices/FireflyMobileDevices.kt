package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FIREFLY_MOBILE device specifications for Android Compose previews.
 *
 * This extension provides FIREFLY_MOBILE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FireflyMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FireflyMobile: Any
  get() = object {
      /** FIREFLY_MOBILE INTENSE_XT */
      val INTENSE_XT = "spec:width=480,height=960,unit=px,dpi=240"

  }
