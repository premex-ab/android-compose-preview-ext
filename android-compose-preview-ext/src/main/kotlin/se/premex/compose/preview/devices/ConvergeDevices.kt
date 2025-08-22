package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CONVERGE device specifications for Android Compose previews.
 *
 * This extension provides CONVERGE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Converge.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Converge: Any
  get() = object {
      /** CONVERGE T7045PS */
      val T7045PS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
