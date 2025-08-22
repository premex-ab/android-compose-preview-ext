package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Cyrus device specifications for Android Compose previews.
 *
 * This extension provides Cyrus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cyrus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cyrus: Any
  get() = object {
      /** Cyrus CM17 */
      val CM17 = "spec:width=320,height=480,unit=px,dpi=132"

      /** Cyrus CM17XA */
      val CM17XA = "spec:width=320,height=480,unit=px,dpi=160"

      /** Cyrus CS22 */
      val CS22 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Cyrus CS22XA */
      val CS22XA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Cyrus CS22XA_EEA */
      val CS22XA_EEA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Cyrus CS40 */
      val CS40 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Cyrus CS45XA */
      val CS45XA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Cyrus CS45XA_EEA */
      val CS45XA_EEA = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
