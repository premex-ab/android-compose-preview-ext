package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SERENITY device specifications for Android Compose previews.
 *
 * This extension provides SERENITY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Serenity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Serenity: Any
  get() = object {
      /** SERENITY BE109 */
      val BE109 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
