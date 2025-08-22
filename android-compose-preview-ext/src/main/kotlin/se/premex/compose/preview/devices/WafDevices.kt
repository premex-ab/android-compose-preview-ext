package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * WAF device specifications for Android Compose previews.
 *
 * This extension provides WAF device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Waf.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Waf: Any
  get() = object {
      /** WAF F808NM */
      val F808NM = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WAF THMTKAW01216 */
      val THMTKAW01216 = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
