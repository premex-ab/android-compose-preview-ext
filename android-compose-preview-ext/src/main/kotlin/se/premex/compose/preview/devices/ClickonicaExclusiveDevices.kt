package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Clickonica_Exclusive device specifications for Android Compose previews.
 *
 * This extension provides Clickonica_Exclusive device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ClickonicaExclusive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ClickonicaExclusive: Any
  get() = object {
      /** Clickonica_Exclusive itabx */
      val ITABX = "spec:width=600,height=1024,unit=px,dpi=160"

  }
