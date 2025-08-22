package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Winnovo device specifications for Android Compose previews.
 *
 * This extension provides Winnovo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Winnovo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Winnovo: Any
  get() = object {
      /** Winnovo M8 */
      val M8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Winnovo P20-Tab */
      val P20_TAB = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Winnovo T10 */
      val T10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Winnovo T7 */
      val T7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Winnovo T8 */
      val T8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Winnovo WinnovoT5 */
      val WINNOVOT5 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
