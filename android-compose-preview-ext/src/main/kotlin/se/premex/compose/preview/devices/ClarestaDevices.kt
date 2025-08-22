package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CLARESTA device specifications for Android Compose previews.
 *
 * This extension provides CLARESTA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Claresta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Claresta: Any
  get() = object {
      /** CLARESTA S6Plus */
      val S6PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
