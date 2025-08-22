package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FACETEL device specifications for Android Compose previews.
 *
 * This extension provides FACETEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Facetel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Facetel: Any
  get() = object {
      /** FACETEL Q10-EEA */
      val Q10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FACETEL Q10-Pro */
      val Q10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FACETEL Q10_T_EEA */
      val Q10_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FACETEL Q10_T_US */
      val Q10_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FACETEL Q10-US */
      val Q10_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FACETEL Q3pro */
      val Q3PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FACETEL Q3pro_eea */
      val Q3PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FACETEL Q3-EEA */
      val Q3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FACETEL Q3_pro */
      val Q3_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FACETEL Q6_US */
      val Q6_US = "spec:width=800,height=1280,unit=px,dpi=200"

      /** FACETEL Q7_EEA */
      val Q7_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** FACETEL Q7_US */
      val Q7_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** FACETEL W3_T_EEA */
      val W3_T_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FACETEL W3_T_US */
      val W3_T_US = "spec:width=800,height=1280,unit=px,dpi=213"

  }
