package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZDK device specifications for Android Compose previews.
 *
 * This extension provides ZDK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zdk.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zdk: Any
  get() = object {
      /** ZDK ZDKMP-T30A */
      val ZDKMP_T30A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZDK ZDKMP-T30B */
      val ZDKMP_T30B = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
