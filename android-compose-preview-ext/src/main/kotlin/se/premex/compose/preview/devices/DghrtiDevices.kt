package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Dghrti device specifications for Android Compose previews.
 *
 * This extension provides Dghrti device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dghrti.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dghrti: Any
  get() = object {
      /** Dghrti TAB20_EEA */
      val TAB20_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Dghrti TAB20_US */
      val TAB20_US = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Dghrti TAB30_EEA */
      val TAB30_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Dghrti TAB30_US */
      val TAB30_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Dghrti TAB50_EEA */
      val TAB50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Dghrti TAB50_US */
      val TAB50_US = "spec:width=800,height=1280,unit=px,dpi=160"

  }
